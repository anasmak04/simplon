PGDMP     )    3    	            z           TODOO    14.3    14.3 
    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    33024    TODOO    DATABASE     i   CREATE DATABASE "TODOO" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Arabic_Saudi Arabia.1256';
    DROP DATABASE "TODOO";
                postgres    false            �            1259    33085    task    TABLE     �   CREATE TABLE public.task (
    task character varying(50) NOT NULL,
    description character varying(50),
    status character varying(50),
    deadline date,
    nom_categorie character varying(50)
);
    DROP TABLE public.task;
       public         heap    postgres    false            �            1259    33025    useer    TABLE     �   CREATE TABLE public.useer (
    namee character varying(50),
    email character varying(50) NOT NULL,
    passwordd character varying(50)
);
    DROP TABLE public.useer;
       public         heap    postgres    false            �          0    33085    task 
   TABLE DATA           R   COPY public.task (task, description, status, deadline, nom_categorie) FROM stdin;
    public          postgres    false    210   �	       �          0    33025    useer 
   TABLE DATA           8   COPY public.useer (namee, email, passwordd) FROM stdin;
    public          postgres    false    209   �	       b           2606    33089    task task_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.task
    ADD CONSTRAINT task_pkey PRIMARY KEY (task);
 8   ALTER TABLE ONLY public.task DROP CONSTRAINT task_pkey;
       public            postgres    false    210            `           2606    33029    useer useer_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY public.useer
    ADD CONSTRAINT useer_pkey PRIMARY KEY (email);
 :   ALTER TABLE ONLY public.useer DROP CONSTRAINT useer_pkey;
       public            postgres    false    209            �   6   x�+I-.1��*-.Q(29S���K��9���t�u�8�R3srR�b���� �      �   �   x�e��n�0E��� �R��ʶ|�K����$J��3<��nF�{��U�=Ɔn"~���MUڪ4�w\�>$���'w���i��@���v�i�"���k�~��`�x�j_�Ey�h�4�s��ָL^�%�X4�����[�����+W�C�����ѐ��z��Gr�Q����H.��-.8S��=���jÓ�f8�y>�I'��vto�޷9�کʬ����X     