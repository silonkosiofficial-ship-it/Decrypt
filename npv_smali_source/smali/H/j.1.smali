.class final LH/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/I;


# static fields
.field public static final a:LH/j;

.field private static final b:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH/j;

    invoke-direct {v0}, LH/j;-><init>()V

    sput-object v0, LH/j;->a:LH/j;

    sget-object v0, LH/j$a;->D:LH/j$a;

    sput-object v0, LH/j;->b:Lx7/l;

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
    .locals 7

    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v1

    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result v2

    sget-object v4, LH/j;->b:Lx7/l;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

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
