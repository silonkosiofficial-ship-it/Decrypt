.class public final LT9/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LT9/b$b;-><init>()V

    return-void
.end method

.method public static final synthetic a(LT9/b$b;LX9/f;LX9/d;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LT9/b$b;->d(LX9/f;LX9/d;)V

    return-void
.end method

.method public static final synthetic b(LT9/b$b;LX9/f;)J
    .locals 0

    invoke-direct {p0, p1}, LT9/b$b;->e(LX9/f;)J

    move-result-wide p0

    return-wide p0
.end method

.method private final d(LX9/f;LX9/d;)V
    .locals 2

    const/16 v0, 0xa

    invoke-virtual {p2, v0}, LX9/d;->v1(I)LX9/d;

    invoke-static {}, LT9/b;->a()LX9/g;

    move-result-object v0

    invoke-interface {p1, v0}, LX9/f;->h0(LX9/g;)J

    move-result-wide v0

    invoke-interface {p1, p2, v0, v1}, LX9/f;->Q0(LX9/d;J)V

    invoke-virtual {p0}, LT9/b$b;->c()LX9/N;

    move-result-object p2

    invoke-interface {p1, p2}, LX9/f;->k0(LX9/N;)I

    return-void
.end method

.method private final e(LX9/f;)J
    .locals 2

    invoke-interface {p1}, LX9/f;->N0()Ljava/lang/String;

    move-result-object p1

    const-wide/16 v0, -0x1

    invoke-static {p1, v0, v1}, LI9/d;->V(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final c()LX9/N;
    .locals 1

    invoke-static {}, LT9/b;->b()LX9/N;

    move-result-object v0

    return-object v0
.end method
