.class public final synthetic LI9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH9/r$c;


# instance fields
.field public final synthetic a:LH9/r;


# direct methods
.method public synthetic constructor <init>(LH9/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI9/b;->a:LH9/r;

    return-void
.end method


# virtual methods
.method public final a(LH9/e;)LH9/r;
    .locals 1

    iget-object v0, p0, LI9/b;->a:LH9/r;

    invoke-static {v0, p1}, LI9/d;->a(LH9/r;LH9/e;)LH9/r;

    move-result-object p1

    return-object p1
.end method
