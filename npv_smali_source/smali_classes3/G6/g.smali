.class public final synthetic LG6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:LH9/C;


# direct methods
.method public synthetic constructor <init>(LH9/C;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG6/g;->C:LH9/C;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LG6/g;->C:LH9/C;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, LG6/h;->y(LH9/C;Ljava/lang/Throwable;)Li7/M;

    move-result-object p1

    return-object p1
.end method
