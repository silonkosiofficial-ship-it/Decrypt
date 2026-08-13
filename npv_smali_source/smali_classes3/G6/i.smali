.class public final synthetic LG6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic C:LH9/z$a;


# direct methods
.method public synthetic constructor <init>(LH9/z$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG6/i;->C:LH9/z$a;

    return-void
.end method


# virtual methods
.method public final u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LG6/i;->C:LH9/z$a;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-static {v0, p1, p2}, LG6/l;->b(LH9/z$a;Ljava/lang/String;Ljava/lang/String;)Li7/M;

    move-result-object p1

    return-object p1
.end method
