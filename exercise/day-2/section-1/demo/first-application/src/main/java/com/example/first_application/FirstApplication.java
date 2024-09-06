package com.example.first_application;

import com.example.first_application.GetAssetResponse;
import com.example.first_application.Request.CreateUserRequest;
import com.example.first_application.Request.EmployeeUserRequest;
import com.example.first_application.Response.CreateUserResponse;
import com.example.first_application.Response.EmployeeUserResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

//	@GetMapping("/assets/{npk}")
//	public GetAssetResponse getAssetsByNpk(
//			@PathVariable Long npk
//	){
//		return GetAssetResponse.builder().npk(npk).fullName("Tasya Raishania").build();
//	}

//	@GetMapping("/assets/{npk}")
//	public GetAssetResponse getAssetsByNpk(
//			@PathVariable Long npk
//	){
//		List<GetAssetResponse> assets = new ArrayList<>();
//		assets.add(GetAssetResponse.builder().npk(1L).fullName("Tasya R").build());
//		assets.add(GetAssetResponse.builder().npk(2L).fullName("Raishania A").build());
//		assets.add(GetAssetResponse.builder().npk(3L).fullName("Amarin G").build());
//		assets.add(GetAssetResponse.builder().npk(4L).fullName("Gata T").build());
//
//		for (GetAssetResponse getAssetResponse : assets) {
//			if (npk.equals(getAssetResponse.getNpk())) {
//				return getAssetResponse;
//			}
//		}
//		return null;
//	}

//	@GetMapping("/assets/{npk}")
//	public List<GetAssetResponse> getAssetsByNpk(
//			@PathVariable Long npk
//	) {
//		List<GetAssetResponse> assets = new ArrayList<>();
//		assets.add(GetAssetResponse.builder().npk(1L).fullName("Tasya R").build());
//		assets.add(GetAssetResponse.builder().npk(2L).fullName("Raishania A").build());
//		assets.add(GetAssetResponse.builder().npk(3L).fullName("Amarin G").build());
//		assets.add(GetAssetResponse.builder().npk(4L).fullName("Gata T").build());
//
//		List<GetAssetResponse> searchedAssets = new ArrayList<>();
//		for (GetAssetResponse asset : assets) {
//			if (asset.getNpk() >= npk) {
//				searchedAssets.add(asset);
//			}
//		}
//		return searchedAssets;
//	}

//	@GetMapping
//	public List<GetAssetResponse> getAsset() {
//		List<GetAssetResponse> assets = List.of(
//				GetAssetResponse.builder()
//						.npk(1L)
//						.fullName("Tasya Raishania")
//						.age(24)
//						.status("Active")
//						.build(),
//				GetAssetResponse.builder()
//						.npk(2L)
//						.fullName("Amarin Gata")
//						.age(24)
//						.status("Inactive")
//						.build(),
//				GetAssetResponse.builder()
//						.npk(3L)
//						.fullName("David Turpyn")
//						.age(25)
//						.status("Active")
//						.build()
//				);
//		return  assets;
//	}

//	@GetMapping String sayHello(){
//		return "Hello World";
//	}

//	@GetMapping("/users")
//	public List<String> getUser(){
//		return List.of("John", "Jane", "Jack");
//	}

//	@GetMapping("/calculator/add")
//	public String getAdd(
//			@RequestParam(name = "panjang") int panjang,
//			@RequestParam(name = "lebar", defaultValue = "1", required = false) int lebar
//	){
//		return String.valueOf(panjang + lebar);
//	}

//	@GetMapping("/assets")
//	public List<GetAssetResponse> getAssets(
//			@RequestParam(name = "page", defaultValue = "0") int page,
//			@RequestParam(name = "size") int size) {
//		List<GetAssetResponse> assets = new ArrayList<>();
//		assets.add(GetAssetResponse.builder().npk(1L).fullName("Tasya R").build());
//		assets.add(GetAssetResponse.builder().npk(2L).fullName("Raishania A").build());
//		assets.add(GetAssetResponse.builder().npk(3L).fullName("Amarin G").build());
//		assets.add(GetAssetResponse.builder().npk(4L).fullName("Gata T").build());
//		assets.add(GetAssetResponse.builder().npk(5L).fullName("Tasya R").build());
//		assets.add(GetAssetResponse.builder().npk(6L).fullName("Raishania A").build());
//		assets.add(GetAssetResponse.builder().npk(7L).fullName("Amarin G").build());
//		assets.add(GetAssetResponse.builder().npk(8L).fullName("Gata T").build());
//
//		int assetsSize = assets.size();
//
//		int start = (page - 1) * size;
//		int end = Math.min(start + size, assetsSize);
//
//		if (start > assetsSize) {
//			return new ArrayList<>();
//		} else {
//			return assets.subList(start, end);
//		}
//	}

//	@PostMapping("/users")
//	public ResponseEntity<List<CreateUserResponse>> createUser (
//			@RequestBody CreateUserRequest request) {
//
//		List<CreateUserResponse> users = new ArrayList<>();
//
//		users.add(CreateUserResponse.builder().npk(1L).fullName("AB").build());
//		users.add(CreateUserResponse.builder().npk(2L).fullName("CD").build());
//		users.add(
//				CreateUserResponse.builder().npk(request.getNpk()).fullName(request.getFullName()).build()
//		);
//
//		return new ResponseEntity<>(users, HttpStatus.OK);
//
//	}

	@PostMapping("/employee")
	public ResponseEntity<List<EmployeeUserResponse>> createUser (
			@RequestBody EmployeeUserRequest request) {



		List<EmployeeUserResponse> employees = new ArrayList<>();

		employees.add(EmployeeUserResponse.builder().id(1L).name("AB").age(1).address("CD").phone("123").build());
		employees.add(EmployeeUserResponse.builder().id(2L).name("EF").age(2).address("GH").phone("456").build());

		if (request.getName() != null && request.getAge() != 0 && request.getPhone() != null) {
			employees.add(
					EmployeeUserResponse.builder().id(employees.size() + 1L).name(request.getName()).age(request.getAge()).address(request.getAddress()).phone(request.getPhone()).build()
			);
		}

		return new ResponseEntity<>(employees, HttpStatus.OK);

	}

}
