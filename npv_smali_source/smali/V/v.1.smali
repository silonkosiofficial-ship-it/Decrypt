.class public abstract LV/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Object;

.field private static final b:LV/D;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LV/v;->a:Ljava/lang/Object;

    new-instance v0, LV/v$a;

    invoke-direct {v0}, LV/v$a;-><init>()V

    sput-object v0, LV/v;->b:LV/D;

    return-void
.end method

.method public static final a(LV/g;LV/s;)LV/r;
    .locals 7

    new-instance v6, LV/u;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p1

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, LV/u;-><init>(LV/s;LV/g;Lm7/i;ILy7/k;)V

    return-object v6
.end method

.method public static final b(LV/g;LV/s;)LV/b1;
    .locals 7

    new-instance v6, LV/u;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p1

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, LV/u;-><init>(LV/s;LV/g;Lm7/i;ILy7/k;)V

    return-object v6
.end method

.method public static final synthetic c()Ljava/lang/Object;
    .locals 1

    sget-object v0, LV/v;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public static final synthetic d(Ljava/util/List;II)V
    .locals 0

    invoke-static {p0, p1, p2}, LV/v;->f(Ljava/util/List;II)V

    return-void
.end method

.method public static final synthetic e(Lr/B;II)V
    .locals 0

    invoke-static {p0, p1, p2}, LV/v;->g(Lr/B;II)V

    return-void
.end method

.method private static final f(Ljava/util/List;II)V
    .locals 2

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0, p2, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final g(Lr/B;II)V
    .locals 2

    invoke-virtual {p0, p1}, Lr/l;->a(I)I

    move-result v0

    invoke-virtual {p0, p2}, Lr/l;->a(I)I

    move-result v1

    invoke-virtual {p0, p1, v1}, Lr/B;->m(II)I

    invoke-virtual {p0, p2, v0}, Lr/B;->m(II)I

    return-void
.end method
