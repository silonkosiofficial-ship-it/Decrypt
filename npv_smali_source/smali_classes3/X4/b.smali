.class public final synthetic LX4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/k;


# instance fields
.field public final synthetic a:LX4/e;


# direct methods
.method public synthetic constructor <init>(LX4/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX4/b;->a:LX4/e;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ll4/l;
    .locals 1

    iget-object v0, p0, LX4/b;->a:LX4/e;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, LX4/e;->b(LX4/e;Ljava/lang/String;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
