.class public final synthetic LY8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# instance fields
.field public final synthetic C:Ljava/lang/Object;

.field public final synthetic D:LY8/h;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;LY8/h;Le9/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY8/g;->C:Ljava/lang/Object;

    iput-object p2, p0, LY8/g;->D:LY8/h;

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LY8/g;->C:Ljava/lang/Object;

    iget-object v1, p0, LY8/g;->D:LY8/h;

    move-object v3, p1

    check-cast v3, Ljava/lang/Throwable;

    move-object v5, p3

    check-cast v5, Lm7/i;

    const/4 v2, 0x0

    move-object v4, p2

    invoke-static/range {v0 .. v5}, LY8/h;->e(Ljava/lang/Object;LY8/h;Le9/a;Ljava/lang/Throwable;Ljava/lang/Object;Lm7/i;)Li7/M;

    move-result-object p1

    return-object p1
.end method
