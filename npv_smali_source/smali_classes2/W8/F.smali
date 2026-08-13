.class public final synthetic LW8/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic C:Ly7/O;

.field public final synthetic D:Z


# direct methods
.method public synthetic constructor <init>(Ly7/O;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW8/F;->C:Ly7/O;

    iput-boolean p2, p0, LW8/F;->D:Z

    return-void
.end method


# virtual methods
.method public final u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LW8/F;->C:Ly7/O;

    iget-boolean v1, p0, LW8/F;->D:Z

    check-cast p1, Lm7/i;

    check-cast p2, Lm7/i$b;

    invoke-static {v0, v1, p1, p2}, LW8/H;->a(Ly7/O;ZLm7/i;Lm7/i$b;)Lm7/i;

    move-result-object p1

    return-object p1
.end method
