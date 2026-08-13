.class public final Lx9/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/b;


# static fields
.field public static final a:Lx9/t;

.field private static final b:Lv9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lx9/t;

    invoke-direct {v0}, Lx9/t;-><init>()V

    sput-object v0, Lx9/t;->a:Lx9/t;

    new-instance v0, Lx9/q0;

    const-string v1, "kotlin.time.Duration"

    sget-object v2, Lv9/d$i;->a:Lv9/d$i;

    invoke-direct {v0, v1, v2}, Lx9/q0;-><init>(Ljava/lang/String;Lv9/d;)V

    sput-object v0, Lx9/t;->b:Lv9/f;

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

    sget-object v0, Lx9/t;->b:Lv9/f;

    return-object v0
.end method

.method public bridge synthetic b(Lw9/h;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0, p1}, Lx9/t;->f(Lw9/h;)J

    move-result-wide v0

    invoke-static {v0, v1}, LT8/a;->o(J)LT8/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lw9/j;Ljava/lang/Object;)V
    .locals 2

    check-cast p2, LT8/a;

    invoke-virtual {p2}, LT8/a;->T()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lx9/t;->g(Lw9/j;J)V

    return-void
.end method

.method public f(Lw9/h;)J
    .locals 2

    const-string v0, "decoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LT8/a;->D:LT8/a$a;

    invoke-interface {p1}, Lw9/h;->o()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LT8/a$a;->d(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public g(Lw9/j;J)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, LT8/a;->P(J)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lw9/j;->E(Ljava/lang/String;)V

    return-void
.end method
