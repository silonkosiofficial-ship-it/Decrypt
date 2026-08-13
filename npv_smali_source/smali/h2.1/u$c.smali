.class final Lh2/u$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/u;->b()Lh2/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lh2/u;


# direct methods
.method constructor <init>(Lh2/u;)V
    .locals 0

    iput-object p1, p0, Lh2/u$c;->D:Lh2/u;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lh2/x$b;
    .locals 1

    iget-object v0, p0, Lh2/u$c;->D:Lh2/u;

    invoke-static {v0}, Lh2/u;->a(Lh2/u;)Lh2/b;

    move-result-object v0

    invoke-virtual {v0}, Lh2/b;->f()Lh2/x$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lh2/u$c;->a()Lh2/x$b;

    move-result-object v0

    return-object v0
.end method
