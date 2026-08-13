.class final Lh2/H$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/H$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:Lh2/H;

.field final synthetic D:Lh2/F;


# direct methods
.method constructor <init>(Lh2/H;Lh2/F;)V
    .locals 0

    iput-object p1, p0, Lh2/H$b$a;->C:Lh2/H;

    iput-object p2, p0, Lh2/H$b$a;->D:Lh2/F;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh2/x;

    invoke-virtual {p0, p1, p2}, Lh2/H$b$a;->b(Lh2/x;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lh2/x;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    sget-object v0, Lh2/K;->a:Lh2/K;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lh2/K;->a(I)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Collected "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, v3}, Lh2/K;->b(ILjava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lh2/H$b$a;->C:Lh2/H;

    invoke-static {v0}, Lh2/H;->f(Lh2/H;)Lm7/i;

    move-result-object v0

    new-instance v1, Lh2/H$b$a$a;

    iget-object v2, p0, Lh2/H$b$a;->C:Lh2/H;

    iget-object v4, p0, Lh2/H$b$a;->D:Lh2/F;

    invoke-direct {v1, p1, v2, v4, v3}, Lh2/H$b$a$a;-><init>(Lh2/x;Lh2/H;Lh2/F;Lm7/e;)V

    invoke-static {v0, v1, p2}, LW8/g;->g(Lm7/i;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
