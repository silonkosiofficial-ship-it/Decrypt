.class final LA/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/I;


# static fields
.field public static final a:LA/O;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LA/O;

    invoke-direct {v0}, LA/O;-><init>()V

    sput-object v0, LA/O;->a:LA/O;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(LD0/o;Ljava/util/List;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/H;->b(LD0/I;LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public b(LD0/M;Ljava/util/List;J)LD0/K;
    .locals 8

    .prologue
    invoke-static {p3, p4}, LY0/b;->j(J)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result p2

    move v2, p2

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    invoke-static {p3, p4}, LY0/b;->i(J)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result v0

    :cond_1
    move v3, v0

    sget-object v5, LA/O$a;->D:LA/O$a;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public synthetic c(LD0/o;Ljava/util/List;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/H;->d(LD0/I;LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public synthetic e(LD0/o;Ljava/util/List;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/H;->c(LD0/I;LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public synthetic j(LD0/o;Ljava/util/List;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/H;->a(LD0/I;LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method
