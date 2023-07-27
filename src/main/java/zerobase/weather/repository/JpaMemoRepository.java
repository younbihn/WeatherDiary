package zerobase.weather.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;
import zerobase.weather.domain.Memo;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public interface JpaMemoRepository extends JpaRepository<Memo, Integer> {
}

// api key : 6ac2bc2cf39728abb3818c944d7769ea
// api : https://api.openweathermap.org/data/2.5/weather?q=seoul&appid=6ac2bc2cf39728abb3818c944d7769ea