.class public final synthetic LY8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# instance fields
.field public final synthetic C:Lx7/l;

.field public final synthetic D:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lx7/l;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY8/f;->C:Lx7/l;

    iput-object p2, p0, LY8/f;->D:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LY8/f;->C:Lx7/l;

    iget-object v1, p0, LY8/f;->D:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    check-cast p3, Lm7/i;

    invoke-static {v0, v1, p1, p2, p3}, LY8/h;->g(Lx7/l;Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/Object;Lm7/i;)Li7/M;

    move-result-object p1

    return-object p1
.end method
