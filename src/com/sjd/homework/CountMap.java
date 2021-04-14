package com.sjd.homework;

import java.util.HashMap;

public interface CountMap<T> {

    /** Добавляет элемент в текущий контейнер
     * @param element элемент для добавления
     */
    void add(T element);

    /** Возвращает количество добавлений элемента
     * @param element элемент, количество добавлений которого нужно узнать
     * @return количество добавлений элемента
     */
    int getCount(T element);

    /** Удаляет элемент из текущего контейнера
     * @param element элемент, который нужно удалить
     * @return количество добавлений элемента(до удаления)
     */
    int remove(T element);

    /** Возвращает количество разных элементов
     * @return количество разных элементов
     */
    int size();

    /** Добавить все элементы из source в текущий контейнер,
     * при совпадении ключей, суммировать значения
     * @param source контейнер, элементы которого нужно добавить в текущий
     */
    void addAll(CountMap<T> source);

    /** Формирует на основе текущего контейнера java.util.Map,
     * где ключ - добавленный элемент,
     * значение - количество его добавлений
     * @return java.util.Map, полученный из текущего контейнера
     */
    HashMap<T, Integer> toMap();

    /** Копирует содержимое текущего контейнера в destination
     * @param destination java.util.Map,
     *                    где ключ - добавленный элемент,
     *                    значение - количество его добавлений
     */
    void toMap(HashMap<T, Integer> destination);
}
