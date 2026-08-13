.class public final synthetic LI6/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:LW8/f0;


# direct methods
.method public synthetic constructor <init>(LW8/f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI6/B;->C:LW8/f0;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LI6/B;->C:LW8/f0;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, LI6/C;->b(LW8/f0;Ljava/lang/Throwable;)Li7/M;

    move-result-object p1

    return-object p1
.end method
