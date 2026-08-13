.class public final Lx9/P0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/b;


# static fields
.field public static final b:Lx9/P0;


# instance fields
.field private final synthetic a:Lx9/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx9/P0;

    invoke-direct {v0}, Lx9/P0;-><init>()V

    sput-object v0, Lx9/P0;->b:Lx9/P0;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lx9/c0;

    const-string v1, "kotlin.Unit"

    sget-object v2, Li7/M;->a:Li7/M;

    invoke-direct {v0, v1, v2}, Lx9/c0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lx9/P0;->a:Lx9/c0;

    return-void
.end method


# virtual methods
.method public a()Lv9/f;
    .locals 1

    iget-object v0, p0, Lx9/P0;->a:Lx9/c0;

    invoke-virtual {v0}, Lx9/c0;->a()Lv9/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(Lw9/h;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lx9/P0;->f(Lw9/h;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public bridge synthetic e(Lw9/j;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Li7/M;

    invoke-virtual {p0, p1, p2}, Lx9/P0;->g(Lw9/j;Li7/M;)V

    return-void
.end method

.method public f(Lw9/h;)V
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx9/P0;->a:Lx9/c0;

    invoke-virtual {v0, p1}, Lx9/c0;->b(Lw9/h;)Ljava/lang/Object;

    return-void
.end method

.method public g(Lw9/j;Li7/M;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx9/P0;->a:Lx9/c0;

    invoke-virtual {v0, p1, p2}, Lx9/c0;->e(Lw9/j;Ljava/lang/Object;)V

    return-void
.end method
