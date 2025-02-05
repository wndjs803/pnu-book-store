package org.example.pnubookstore;

import java.util.List;

import org.example.pnubookstore.willdelete.Auction;
import org.example.pnubookstore.domain.user.entity.User;
import org.example.pnubookstore.domain.base.constant.Role;
import org.example.pnubookstore.willdelete.repository.AuctionJpaRepository;
import org.example.pnubookstore.domain.user.repository.UserJpaRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

// @Profile({"dev"})
@RequiredArgsConstructor
@Component
public class TestCase implements ApplicationRunner {
	private final AuctionJpaRepository auctionJpaRepository;
	private final UserJpaRepository userJpaRepository;
	private final PasswordEncoder passwordEncoder;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		User user = User.builder()
			.email("rjsdnxogh12@pusan.ac.kr")
			.password(passwordEncoder.encode("qwer1234"))
			.nickname("taeho")
			.role(Role.ROLE_USER)
			.build();
		userJpaRepository.save(user);

		List<Auction> auctions = List.of(
			Auction.builder().user(user).title("제목1").description("설명1").build(),
			Auction.builder().user(user).title("제목2").description("설명2").build(),
			Auction.builder().user(user).title("제목3").description("설명3").build(),
			Auction.builder().user(user).title("제목4").description("설명4").build(),
			Auction.builder().user(user).title("제목5").description("설명5").build(),
			Auction.builder().user(user).title("제목6").description("설명6").build(),
			Auction.builder().user(user).title("제목7").description("설명7").build(),
			Auction.builder().user(user).title("제목8").description("설명8").build(),
			Auction.builder().user(user).title("제목9").description("설명9").build(),
			Auction.builder().user(user).title("제목10").description("설명10").build(),
			Auction.builder().user(user).title("제목11").description("설명11").build(),
			Auction.builder().user(user).title("제목12").description("설명12").build(),
			Auction.builder().user(user).title("제목13").description("설명13").build(),
			Auction.builder().user(user).title("제목14").description("설명14").build(),
			Auction.builder().user(user).title("제목15").description("설명15").build(),
			Auction.builder().user(user).title("제목16").description("설명16").build(),
			Auction.builder().user(user).title("제목17").description("설명17").build(),
			Auction.builder().user(user).title("제목18").description("설명18").build(),
			Auction.builder().user(user).title("제목19").description("설명19").build(),
			Auction.builder().user(user).title("제목20").description("설명20").build()
		);
		auctionJpaRepository.saveAll(auctions);
	}
}
