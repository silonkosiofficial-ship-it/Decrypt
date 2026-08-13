.class final Lv/y$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/y;->U1(Lz/l;Lz/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lz/l;

.field final synthetic E:Lz/i;


# direct methods
.method constructor <init>(Lz/l;Lz/i;)V
    .locals 0

    iput-object p1, p0, Lv/y$b;->D:Lz/l;

    iput-object p2, p0, Lv/y$b;->E:Lz/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lv/y$b;->D:Lz/l;

    iget-object v0, p0, Lv/y$b;->E:Lz/i;

    invoke-interface {p1, v0}, Lz/l;->a(Lz/i;)Z

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lv/y$b;->a(Ljava/lang/Throwable;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
