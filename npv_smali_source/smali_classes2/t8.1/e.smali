.class public final Lt8/e;
.super Lt8/o;
.source "SourceFile"


# direct methods
.method public constructor <init>(C)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    invoke-direct {p0, p1}, Lt8/o;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method private final c(C)Ljava/lang/String;
    .locals 1

    .prologue
    const/16 v0, 0x8

    if-ne p1, v0, :cond_0

    const-string p1, "\\b"

    goto :goto_0

    :cond_0
    const/16 v0, 0x9

    if-ne p1, v0, :cond_1

    const-string p1, "\\t"

    goto :goto_0

    :cond_1
    const/16 v0, 0xa

    if-ne p1, v0, :cond_2

    const-string p1, "\\n"

    goto :goto_0

    :cond_2
    const/16 v0, 0xc

    if-ne p1, v0, :cond_3

    const-string p1, "\\f"

    goto :goto_0

    :cond_3
    const/16 v0, 0xd

    if-ne p1, v0, :cond_4

    const-string p1, "\\r"

    goto :goto_0

    :cond_4
    invoke-direct {p0, p1}, Lt8/e;->e(C)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_5
    const-string p1, "?"

    :goto_0
    return-object p1
.end method

.method private final e(C)Z
    .locals 1

    .prologue
    invoke-static {p1}, Ljava/lang/Character;->getType(C)I

    move-result p1

    int-to-byte p1, p1

    if-eqz p1, :cond_0

    const/16 v0, 0xd

    if-eq p1, v0, :cond_0

    const/16 v0, 0xe

    if-eq p1, v0, :cond_0

    const/16 v0, 0xf

    if-eq p1, v0, :cond_0

    const/16 v0, 0x10

    if-eq p1, v0, :cond_0

    const/16 v0, 0x12

    if-eq p1, v0, :cond_0

    const/16 v0, 0x13

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public bridge synthetic a(LO7/G;)LF8/E;
    .locals 0

    invoke-virtual {p0, p1}, Lt8/e;->d(LO7/G;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public d(LO7/G;)LF8/M;
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/G;->t()LL7/g;

    move-result-object p1

    invoke-virtual {p1}, LL7/g;->u()LF8/M;

    move-result-object p1

    const-string v0, "getCharType(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Character;

    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    move-result v1

    invoke-direct {p0, v1}, Lt8/e;->c(C)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "\\u%04X (\'%s\')"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
