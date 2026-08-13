.class public abstract Lb1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/u;


# instance fields
.field private final a:Li1/f;

.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Li1/f;I)V
    .locals 1

    const-string v0, "containerObject"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/b;->a:Li1/f;

    sget-object p1, Lb1/a;->a:Lb1/a;

    invoke-virtual {p1, p2}, Lb1/a;->a(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lb1/b;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lb1/i$b;FF)V
    .locals 3

    const-string v0, "anchor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lb1/a;->a:Lb1/a;

    invoke-virtual {p1}, Lb1/i$b;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Lb1/a;->a(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Li1/a;

    const/4 v2, 0x0

    new-array v2, v2, [C

    invoke-direct {v1, v2}, Li1/a;-><init>([C)V

    sget-object v2, Li1/h;->K:Li1/h$a;

    invoke-virtual {p1}, Lb1/i$b;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Li1/h$a;->a(Ljava/lang/String;)Li1/h;

    move-result-object p1

    invoke-virtual {v1, p1}, Li1/b;->P(Li1/c;)V

    invoke-virtual {v2, v0}, Li1/h$a;->a(Ljava/lang/String;)Li1/h;

    move-result-object p1

    invoke-virtual {v1, p1}, Li1/b;->P(Li1/c;)V

    new-instance p1, Li1/e;

    invoke-direct {p1, p2}, Li1/e;-><init>(F)V

    invoke-virtual {v1, p1}, Li1/b;->P(Li1/c;)V

    new-instance p1, Li1/e;

    invoke-direct {p1, p3}, Li1/e;-><init>(F)V

    invoke-virtual {v1, p1}, Li1/b;->P(Li1/c;)V

    iget-object p1, p0, Lb1/b;->a:Li1/f;

    iget-object p2, p0, Lb1/b;->b:Ljava/lang/String;

    invoke-virtual {p1, p2, v1}, Li1/b;->k0(Ljava/lang/String;Li1/c;)V

    return-void
.end method
