.class public final synthetic LY8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# instance fields
.field public final synthetic C:LY8/h;


# direct methods
.method public synthetic constructor <init>(LY8/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY8/e;->C:LY8/h;

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LY8/e;->C:LY8/h;

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-static {v0, p1, p2, p3}, LY8/h;->f(LY8/h;Le9/a;Ljava/lang/Object;Ljava/lang/Object;)Lx7/q;

    move-result-object p1

    return-object p1
.end method
