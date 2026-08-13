.class public final synthetic LW9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW9/a$a;


# instance fields
.field public final synthetic a:LH9/x;


# direct methods
.method public synthetic constructor <init>(LH9/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW9/c;->a:LH9/x;

    return-void
.end method


# virtual methods
.method public final a(LH9/z;LW9/b;)LW9/a;
    .locals 1

    iget-object v0, p0, LW9/c;->a:LH9/x;

    invoke-static {v0, p1, p2}, LW9/d;->a(LH9/x;LH9/z;LW9/b;)LW9/a;

    move-result-object p1

    return-object p1
.end method
