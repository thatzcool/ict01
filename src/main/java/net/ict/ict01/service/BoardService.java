package net.ict.ict01.service;

import net.ict.ict01.dto.BoardDTO;
import net.ict.ict01.dto.PageRequestDTO;
import net.ict.ict01.dto.PageResponseDTO;

public interface BoardService {

    Long register(BoardDTO boardDTO);

    BoardDTO readOne(Long bno);

    void modify(BoardDTO boardDTO);

    void remove(Long bno);

    PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO);
}
