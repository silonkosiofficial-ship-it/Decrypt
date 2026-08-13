.class public final synthetic LY4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/c;


# instance fields
.field public final synthetic a:LY4/h;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(LY4/h;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY4/g;->a:LY4/h;

    iput-boolean p2, p0, LY4/g;->b:Z

    return-void
.end method


# virtual methods
.method public final a(Ll4/l;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LY4/g;->a:LY4/h;

    iget-boolean v1, p0, LY4/g;->b:Z

    invoke-static {v0, v1, p1}, LY4/h;->g(LY4/h;ZLl4/l;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
