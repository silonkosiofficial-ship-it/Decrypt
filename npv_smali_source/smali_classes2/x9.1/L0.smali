.class public final Lx9/L0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/b;


# static fields
.field public static final a:Lx9/L0;

.field private static final b:Lv9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx9/L0;

    invoke-direct {v0}, Lx9/L0;-><init>()V

    sput-object v0, Lx9/L0;->a:Lx9/L0;

    sget-object v0, Ly7/w;->a:Ly7/w;

    invoke-static {v0}, Lu9/a;->D(Ly7/w;)Lt9/b;

    move-result-object v0

    const-string v1, "kotlin.ULong"

    invoke-static {v1, v0}, Lx9/G;->a(Ljava/lang/String;Lt9/b;)Lv9/f;

    move-result-object v0

    sput-object v0, Lx9/L0;->b:Lv9/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lv9/f;
    .locals 1

    sget-object v0, Lx9/L0;->b:Lv9/f;

    return-object v0
.end method

.method public bridge synthetic b(Lw9/h;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0, p1}, Lx9/L0;->f(Lw9/h;)J

    move-result-wide v0

    invoke-static {v0, v1}, Li7/G;->e(J)Li7/G;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lw9/j;Ljava/lang/Object;)V
    .locals 2

    check-cast p2, Li7/G;

    invoke-virtual {p2}, Li7/G;->q()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lx9/L0;->g(Lw9/j;J)V

    return-void
.end method

.method public f(Lw9/h;)J
    .locals 2

    const-string v0, "decoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/L0;->a()Lv9/f;

    move-result-object v0

    invoke-interface {p1, v0}, Lw9/h;->p(Lv9/f;)Lw9/h;

    move-result-object p1

    invoke-interface {p1}, Lw9/h;->q()J

    move-result-wide v0

    invoke-static {v0, v1}, Li7/G;->g(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public g(Lw9/j;J)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/L0;->a()Lv9/f;

    move-result-object v0

    invoke-interface {p1, v0}, Lw9/j;->w(Lv9/f;)Lw9/j;

    move-result-object p1

    invoke-interface {p1, p2, p3}, Lw9/j;->D(J)V

    return-void
.end method
