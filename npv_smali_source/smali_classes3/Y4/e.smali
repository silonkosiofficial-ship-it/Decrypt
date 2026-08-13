.class public final synthetic LY4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/k;


# instance fields
.field public final synthetic a:LY4/h;


# direct methods
.method public synthetic constructor <init>(LY4/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY4/e;->a:LY4/h;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ll4/l;
    .locals 1

    iget-object v0, p0, LY4/e;->a:LY4/h;

    check-cast p1, LV4/c;

    invoke-static {v0, p1}, LY4/h;->f(LY4/h;LV4/c;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
