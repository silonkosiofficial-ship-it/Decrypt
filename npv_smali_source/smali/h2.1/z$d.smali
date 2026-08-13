.class final Lh2/z$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/z;->q(LZ8/f;Lh2/t;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:Lh2/z;

.field final synthetic D:Lh2/t;


# direct methods
.method constructor <init>(Lh2/z;Lh2/t;)V
    .locals 0

    iput-object p1, p0, Lh2/z$d;->C:Lh2/z;

    iput-object p2, p0, Lh2/z$d;->D:Lh2/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh2/l;

    invoke-virtual {p0, p1, p2}, Lh2/z$d;->b(Lh2/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lh2/l;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    iget-object v0, p0, Lh2/z$d;->C:Lh2/z;

    iget-object v1, p0, Lh2/z$d;->D:Lh2/t;

    invoke-static {v0, v1, p1, p2}, Lh2/z;->c(Lh2/z;Lh2/t;Lh2/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
