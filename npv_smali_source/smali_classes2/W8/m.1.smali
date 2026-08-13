.class public final synthetic LW8/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# instance fields
.field public final synthetic C:Lx7/l;


# direct methods
.method public synthetic constructor <init>(Lx7/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW8/m;->C:Lx7/l;

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LW8/m;->C:Lx7/l;

    check-cast p1, Ljava/lang/Throwable;

    check-cast p3, Lm7/i;

    invoke-static {v0, p1, p2, p3}, LW8/n;->j(Lx7/l;Ljava/lang/Throwable;Ljava/lang/Object;Lm7/i;)Li7/M;

    move-result-object p1

    return-object p1
.end method
