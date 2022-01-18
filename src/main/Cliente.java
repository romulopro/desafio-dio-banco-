package main;


import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@RequiredArgsConstructor
public class Cliente {
	@Getter
	@Setter
	@NonNull
	private String nome;
}
