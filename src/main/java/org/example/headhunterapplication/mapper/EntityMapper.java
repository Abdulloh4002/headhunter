package org.example.headhunterapplication.mapper;

import java.util.List;

public interface EntityMapper<D,E>{
    D toDTO(E e);
    E toEntity(D d);
    List<D> toDTO(List<E> es);
    List<E> toEntity(List<D> ds);
}
