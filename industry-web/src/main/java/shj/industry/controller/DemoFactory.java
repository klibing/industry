package shj.industry.controller;

import java.util.function.Supplier;

public interface DemoFactory {
	static IDome create(Supplier<IDome> supplier) {
		return supplier.get();
	}
}
