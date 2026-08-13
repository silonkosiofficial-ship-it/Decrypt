.class public abstract LC/L;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LC/u;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    new-instance v0, LC/L$a;

    move-object v5, v0

    invoke-direct {v0}, LC/L$a;-><init>()V

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v11

    sget-object v16, Lx/s;->C:Lx/s;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v1}, LY0/g;->b(FFILjava/lang/Object;)LY0/e;

    move-result-object v8

    sget-object v0, Lm7/j;->C:Lm7/j;

    invoke-static {v0}, LW8/O;->a(Lm7/i;)LW8/N;

    move-result-object v7

    new-instance v19, LC/u;

    move-object/from16 v0, v19

    sget-object v10, LC/L$b;->D:LC/L$b;

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v0 .. v18}, LC/u;-><init>(LC/x;IZFLD0/K;ZLW8/N;LY0/e;ILx7/l;Ljava/util/List;IIIZLx/s;II)V

    sput-object v19, LC/L;->a:LC/u;

    return-void
.end method

.method public static final synthetic a()LC/u;
    .locals 1

    sget-object v0, LC/L;->a:LC/u;

    return-object v0
.end method

.method public static final b(IILV/n;II)LC/K;
    .locals 10

    .prologue
    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move p0, v1

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    move p1, v1

    :cond_1
    invoke-static {}, LV/q;->H()Z

    move-result p4

    if-eqz p4, :cond_2

    const/4 p4, -0x1

    const-string v0, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:71)"

    const v2, 0x1bd5b8c

    invoke-static {v2, p3, p4, v0}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    new-array v3, v1, [Ljava/lang/Object;

    sget-object p4, LC/K;->v:LC/K$c;

    invoke-virtual {p4}, LC/K$c;->a()Le0/j;

    move-result-object v4

    and-int/lit8 p4, p3, 0xe

    xor-int/lit8 p4, p4, 0x6

    const/4 v0, 0x4

    const/4 v2, 0x1

    if-le p4, v0, :cond_3

    invoke-interface {p2, p0}, LV/n;->i(I)Z

    move-result p4

    if-nez p4, :cond_4

    :cond_3
    and-int/lit8 p4, p3, 0x6

    if-ne p4, v0, :cond_5

    :cond_4
    move p4, v2

    goto :goto_0

    :cond_5
    move p4, v1

    :goto_0
    and-int/lit8 v0, p3, 0x70

    xor-int/lit8 v0, v0, 0x30

    const/16 v5, 0x20

    if-le v0, v5, :cond_6

    invoke-interface {p2, p1}, LV/n;->i(I)Z

    move-result v0

    if-nez v0, :cond_7

    :cond_6
    and-int/lit8 p3, p3, 0x30

    if-ne p3, v5, :cond_8

    :cond_7
    move v1, v2

    :cond_8
    or-int p3, p4, v1

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object p4

    if-nez p3, :cond_9

    sget-object p3, LV/n;->a:LV/n$a;

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p4, p3, :cond_a

    :cond_9
    new-instance p4, LC/L$c;

    invoke-direct {p4, p0, p1}, LC/L$c;-><init>(II)V

    invoke-interface {p2, p4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_a
    move-object v6, p4

    check-cast v6, Lx7/a;

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v5, 0x0

    move-object v7, p2

    invoke-static/range {v3 .. v9}, Le0/b;->e([Ljava/lang/Object;Le0/j;Ljava/lang/String;Lx7/a;LV/n;II)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LC/K;

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-static {}, LV/q;->P()V

    :cond_b
    return-object p0
.end method
