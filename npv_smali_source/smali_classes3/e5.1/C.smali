.class public final synthetic Le5/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF5/a$a;


# instance fields
.field public final synthetic a:LF5/a$a;

.field public final synthetic b:LF5/a$a;


# direct methods
.method public synthetic constructor <init>(LF5/a$a;LF5/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le5/C;->a:LF5/a$a;

    iput-object p2, p0, Le5/C;->b:LF5/a$a;

    return-void
.end method


# virtual methods
.method public final a(LF5/b;)V
    .locals 2

    iget-object v0, p0, Le5/C;->a:LF5/a$a;

    iget-object v1, p0, Le5/C;->b:LF5/a$a;

    invoke-static {v0, v1, p1}, Le5/D;->c(LF5/a$a;LF5/a$a;LF5/b;)V

    return-void
.end method
