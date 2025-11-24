package com.pepsico.sb.controller;

import com.pepsico.sb.entity.Nudge;
import com.pepsico.sb.entity.User;
import com.pepsico.sb.model.*;
import com.pepsico.sb.repository.NudgeRepository;
import com.pepsico.sb.repository.UserRepository;
import com.pepsico.sb.service.AuthService;
import com.pepsico.sb.service.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
@Tag(name = "User Management", description = "APIs for user management, authentication, and orders")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    private AuthService authService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private NudgeRepository nudgeRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    @Operation(summary = "Get all users", description = "Retrieve a list of all users in the system")
    @ApiResponse(responseCode = "200", description = "Successfully retrieved all users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/status")
    @Operation(summary = "Check service status", description = "Returns the status of the service")
    @ApiResponse(responseCode = "200", description = "Service is up and running")
    public String status() {
        return "Awesome, I am up and running";
    }

    @PostMapping("/login")
    @Operation(summary = "User login", description = "Authenticate user with email and password")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Login successful"),
            @ApiResponse(responseCode = "401", description = "Invalid credentials")
    })
    public LoginResponse login(@RequestBody LoginRequest request) {
        return authService.login(request);
    }

    @GetMapping("/orders/email/{email}")
    @Operation(summary = "Get orders by email", description = "Retrieve all orders for a specific user by email")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Orders retrieved successfully"),
            @ApiResponse(responseCode = "404", description = "User not found")
    })
    public ResponseEntity<List<OrderResponse>> getOrdersByEmail(
            @PathVariable("email")
            @Parameter(description = "User email address", example = "alice@pepsico.com")
            String email) {
        return ResponseEntity.ok(orderService.getOrdersByEmail(email));
    }

    @GetMapping("/orders")
    @Operation(summary = "Get all orders", description = "Retrieve all orders from all users")
    @ApiResponse(responseCode = "200", description = "All orders retrieved successfully")
    public ResponseEntity<List<OrderResponse>> getAllOrders() {
        return ResponseEntity.ok(orderService.getAllOrders());
    }

    @GetMapping("/orders/id/{id}")
    @Operation(summary = "Get order by ID", description = "Retrieve a specific order by its ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Order retrieved successfully"),
            @ApiResponse(responseCode = "404", description = "Order not found")
    })
    public ResponseEntity<OrderResponse> getOrderById(
            @PathVariable("id")
            @Parameter(description = "Order ID", example = "1")
            Long id) {
        return ResponseEntity.ok(orderService.getOrderById(id));
    }

    @PostMapping("/order")
    @Operation(summary = "Create a new order", description = "Create a new order for a user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Order created successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid order data")
    })
    public ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest request) {
        OrderResponse resp = orderService.createOrder(request);
        return ResponseEntity.ok(resp);
    }

    @PostMapping("/nudge")
    @Operation(summary = "Create a new Nudge", description = "Create a new nudge for a user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Nudge created successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid Nudge details")
    })
    public ResponseEntity<String> createNudge(@RequestBody NudgeRequest request) {

        Nudge nudge = new Nudge();

        nudge.setNudgeType(request.getNudgeType());
        nudge.setProductName(request.getProductName());
        nudge.setUserEmail(request.getUserEmail());

        nudgeRepository.save(nudge);
        return ResponseEntity.ok("Nudge has been created");
    }

    @GetMapping("/{email}")
    @Operation(summary = "Get user details by email", description = "Retrieve user details (email, firstName, lastName) by email address")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User details retrieved successfully"),
            @ApiResponse(responseCode = "404", description = "User not found")
    })
    public ResponseEntity<UserResponse> getUserDetailsByEmail(
            @PathVariable("email")
            @Parameter(description = "User email address", example = "alice@pepsico.com")
            String email) {

        var user = userRepository.findById(email);

        if (user.isPresent()) {
            User foundUser = user.get();
            UserResponse response = new UserResponse(
                    foundUser.getEmail(),
                    foundUser.getFirstName(),
                    foundUser.getLastName()
            );
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
