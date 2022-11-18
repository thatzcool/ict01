package net.ict.ict01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.ict.ict01.domain.Board;
import net.ict.ict01.repository.search.BoardSearch;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardSearch {


}
