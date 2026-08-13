.class final LB8/E$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB8/E;-><init>(LB8/m;LB8/E;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LB8/E;


# direct methods
.method constructor <init>(LB8/E;)V
    .locals 0

    iput-object p1, p0, LB8/E$a;->D:LB8/E;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)LO7/h;
    .locals 1

    iget-object v0, p0, LB8/E$a;->D:LB8/E;

    invoke-static {v0, p1}, LB8/E;->a(LB8/E;I)LO7/h;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, LB8/E$a;->a(I)LO7/h;

    move-result-object p1

    return-object p1
.end method
