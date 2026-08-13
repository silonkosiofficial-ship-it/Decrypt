.class final Lh2/H$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/H;-><init>(Lm7/i;Lh2/F;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lh2/H;


# direct methods
.method constructor <init>(Lh2/H;)V
    .locals 0

    iput-object p1, p0, Lh2/H$a;->D:Lh2/H;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lh2/H$a;->D:Lh2/H;

    invoke-static {v0}, Lh2/H;->i(Lh2/H;)LZ8/x;

    move-result-object v0

    sget-object v1, Li7/M;->a:Li7/M;

    invoke-interface {v0, v1}, LZ8/x;->n(Ljava/lang/Object;)Z

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lh2/H$a;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
