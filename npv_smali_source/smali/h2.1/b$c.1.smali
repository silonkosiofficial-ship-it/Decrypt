.class final Lh2/b$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/b;-><init>(LZ8/f;LW8/N;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lh2/b;


# direct methods
.method constructor <init>(Lh2/b;)V
    .locals 0

    iput-object p1, p0, Lh2/b$c;->D:Lh2/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lh2/b$c;->D:Lh2/b;

    invoke-static {p1}, Lh2/b;->b(Lh2/b;)LZ8/x;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LZ8/x;->n(Ljava/lang/Object;)Z

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lh2/b$c;->a(Ljava/lang/Throwable;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
