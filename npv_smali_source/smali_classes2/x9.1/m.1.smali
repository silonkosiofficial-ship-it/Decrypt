.class public final Lx9/m;
.super Lx9/p0;
.source "SourceFile"

# interfaces
.implements Lt9/b;


# static fields
.field public static final c:Lx9/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx9/m;

    invoke-direct {v0}, Lx9/m;-><init>()V

    sput-object v0, Lx9/m;->c:Lx9/m;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    sget-object v0, Ly7/g;->a:Ly7/g;

    invoke-static {v0}, Lu9/a;->z(Ly7/g;)Lt9/b;

    move-result-object v0

    invoke-direct {p0, v0}, Lx9/p0;-><init>(Lt9/b;)V

    return-void
.end method


# virtual methods
.method protected A([C)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p1, p1

    return p1
.end method

.method protected B()[C
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [C

    return-object v0
.end method

.method protected C(Lw9/d;ILx9/l;Z)V
    .locals 0

    const-string p4, "decoder"

    invoke-static {p1, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "builder"

    invoke-static {p3, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/p0;->a()Lv9/f;

    move-result-object p4

    invoke-interface {p1, p4, p2}, Lw9/d;->i(Lv9/f;I)C

    move-result p1

    invoke-virtual {p3, p1}, Lx9/l;->e(C)V

    return-void
.end method

.method protected D([C)Lx9/l;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx9/l;

    invoke-direct {v0, p1}, Lx9/l;-><init>([C)V

    return-object v0
.end method

.method protected E(Lw9/f;[CI)V
    .locals 3

    .prologue
    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_0

    invoke-virtual {p0}, Lx9/p0;->a()Lv9/f;

    move-result-object v1

    aget-char v2, p2, v0

    invoke-interface {p1, v1, v0, v2}, Lw9/f;->C(Lv9/f;IC)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic j(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, [C

    invoke-virtual {p0, p1}, Lx9/m;->A([C)I

    move-result p1

    return p1
.end method

.method public bridge synthetic m(Lw9/d;ILjava/lang/Object;Z)V
    .locals 0

    check-cast p3, Lx9/l;

    invoke-virtual {p0, p1, p2, p3, p4}, Lx9/m;->C(Lw9/d;ILx9/l;Z)V

    return-void
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [C

    invoke-virtual {p0, p1}, Lx9/m;->D([C)Lx9/l;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic w()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lx9/m;->B()[C

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic z(Lw9/f;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, [C

    invoke-virtual {p0, p1, p2, p3}, Lx9/m;->E(Lw9/f;[CI)V

    return-void
.end method
