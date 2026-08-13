.class abstract synthetic LV/w1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LV/B1;

.field private static final b:LV/B1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LV/B1;

    invoke-direct {v0}, LV/B1;-><init>()V

    sput-object v0, LV/w1;->a:LV/B1;

    new-instance v0, LV/B1;

    invoke-direct {v0}, LV/B1;-><init>()V

    sput-object v0, LV/w1;->b:LV/B1;

    return-void
.end method

.method public static final synthetic a()LV/B1;
    .locals 1

    sget-object v0, LV/w1;->a:LV/B1;

    return-object v0
.end method

.method public static final b()LX/b;
    .locals 4

    .prologue
    sget-object v0, LV/w1;->b:LV/B1;

    invoke-virtual {v0}, LV/B1;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LX/b;

    if-nez v1, :cond_0

    new-instance v1, LX/b;

    const/4 v2, 0x0

    new-array v3, v2, [LV/K;

    invoke-direct {v1, v3, v2}, LX/b;-><init>([Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, LV/B1;->b(Ljava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method public static final c(LV/u1;Lx7/a;)LV/G1;
    .locals 1

    new-instance v0, LV/I;

    invoke-direct {v0, p1, p0}, LV/I;-><init>(Lx7/a;LV/u1;)V

    return-object v0
.end method

.method public static final d(Lx7/a;)LV/G1;
    .locals 2

    new-instance v0, LV/I;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LV/I;-><init>(Lx7/a;LV/u1;)V

    return-object v0
.end method
