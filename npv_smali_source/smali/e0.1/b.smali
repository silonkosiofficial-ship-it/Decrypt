.class public abstract Le0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:I = 0x24


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final synthetic a(Le0/g;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Le0/b;->f(Le0/g;Ljava/lang/Object;)V

    return-void
.end method

.method public static final b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable()."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Le0/j;)Le0/j;
    .locals 2

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le0/b$a;

    invoke-direct {v0, p0}, Le0/b$a;-><init>(Le0/j;)V

    new-instance v1, Le0/b$b;

    invoke-direct {v1, p0}, Le0/b$b;-><init>(Le0/j;)V

    invoke-static {v0, v1}, Le0/k;->a(Lx7/p;Lx7/l;)Le0/j;

    move-result-object p0

    return-object p0
.end method

.method public static final d([Ljava/lang/Object;Le0/j;Ljava/lang/String;Lx7/a;LV/n;II)LV/w0;
    .locals 7

    .prologue
    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v2, p2

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, -0x1

    const-string p6, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:127)"

    const v0, -0xc0b1824

    invoke-static {v0, p5, p2, p6}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_1
    array-length p2, p0

    invoke-static {p0, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1}, Le0/b;->c(Le0/j;)Le0/j;

    move-result-object v1

    and-int/lit16 v5, p5, 0x1f80

    const/4 v6, 0x0

    move-object v3, p3

    move-object v4, p4

    invoke-static/range {v0 .. v6}, Le0/b;->e([Ljava/lang/Object;Le0/j;Ljava/lang/String;Lx7/a;LV/n;II)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LV/w0;

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, LV/q;->P()V

    :cond_2
    return-object p0
.end method

.method public static final e([Ljava/lang/Object;Le0/j;Ljava/lang/String;Lx7/a;LV/n;II)Ljava/lang/Object;
    .locals 9

    .prologue
    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_0

    invoke-static {}, Le0/k;->b()Le0/j;

    move-result-object p1

    :cond_0
    and-int/lit8 p6, p6, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    invoke-static {}, LV/q;->H()Z

    move-result p6

    if-eqz p6, :cond_2

    const/4 p6, -0x1

    const-string v1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)"

    const v2, 0x1a56bfab

    invoke-static {v2, p5, p6, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    const/4 p6, 0x0

    invoke-static {p4, p6}, LV/k;->a(LV/n;I)I

    move-result v1

    if-eqz p2, :cond_3

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_4

    :cond_3
    sget p2, Le0/b;->a:I

    invoke-static {p2}, LS8/a;->a(I)I

    move-result p2

    invoke-static {v1, p2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p2

    const-string v1, "toString(this, checkRadix(radix))"

    invoke-static {p2, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>"

    invoke-static {p1, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Le0/i;->d()LV/O0;

    move-result-object v1

    invoke-interface {p4, v1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Le0/g;

    invoke-interface {p4}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    sget-object v7, LV/n;->a:LV/n$a;

    invoke-virtual {v7}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_7

    if-eqz v6, :cond_5

    invoke-interface {v6, p2}, Le0/g;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-interface {p1, v1}, Le0/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :cond_5
    if-nez v0, :cond_6

    invoke-interface {p3}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    :cond_6
    move-object v4, v0

    new-instance v8, Le0/c;

    move-object v0, v8

    move-object v1, p1

    move-object v2, v6

    move-object v3, p2

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Le0/c;-><init>(Le0/j;Le0/g;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    invoke-interface {p4, v8}, LV/n;->K(Ljava/lang/Object;)V

    move-object v1, v8

    :cond_7
    check-cast v1, Le0/c;

    invoke-virtual {v1, p0}, Le0/c;->g([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_8

    invoke-interface {p3}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    :cond_8
    move-object p3, v0

    invoke-interface {p4, v1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    and-int/lit8 v2, p5, 0x70

    xor-int/lit8 v2, v2, 0x30

    const/16 v3, 0x20

    if-le v2, v3, :cond_9

    invoke-interface {p4, p1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    :cond_9
    and-int/lit8 p5, p5, 0x30

    if-ne p5, v3, :cond_b

    :cond_a
    const/4 p5, 0x1

    goto :goto_0

    :cond_b
    move p5, p6

    :goto_0
    or-int/2addr p5, v0

    invoke-interface {p4, v6}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p5, v0

    invoke-interface {p4, p2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p5, v0

    invoke-interface {p4, p3}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p5, v0

    invoke-interface {p4, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p5, v0

    invoke-interface {p4}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    if-nez p5, :cond_c

    invoke-virtual {v7}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p5

    if-ne v0, p5, :cond_d

    :cond_c
    new-instance p5, Le0/b$c;

    move-object v0, p5

    move-object v2, p1

    move-object v3, v6

    move-object v4, p2

    move-object v5, p3

    move-object v6, p0

    invoke-direct/range {v0 .. v6}, Le0/b$c;-><init>(Le0/c;Le0/j;Le0/g;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    invoke-interface {p4, p5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_d
    check-cast v0, Lx7/a;

    invoke-static {v0, p4, p6}, LV/Q;->f(Lx7/a;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_e

    invoke-static {}, LV/q;->P()V

    :cond_e
    return-object p3
.end method

.method private static final f(Le0/g;Ljava/lang/Object;)V
    .locals 2

    .prologue
    if-eqz p1, :cond_2

    invoke-interface {p0, p1}, Le0/g;->a(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    new-instance p0, Ljava/lang/IllegalArgumentException;

    instance-of v0, p1, Lf0/q;

    if-eqz v0, :cond_1

    check-cast p1, Lf0/q;

    invoke-interface {p1}, Lf0/q;->c()LV/u1;

    move-result-object v0

    invoke-static {}, LV/v1;->j()LV/u1;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-interface {p1}, Lf0/q;->c()LV/u1;

    move-result-object v0

    invoke-static {}, LV/v1;->p()LV/u1;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-interface {p1}, Lf0/q;->c()LV/u1;

    move-result-object v0

    invoke-static {}, LV/v1;->m()LV/u1;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const-string p1, "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver"

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MutableState containing "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable()."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Le0/b;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    return-void
.end method
