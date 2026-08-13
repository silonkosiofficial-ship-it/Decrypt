.class final LI7/x$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/x;-><init>(LI7/n;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/x;


# direct methods
.method constructor <init>(LI7/x;)V
    .locals 0

    iput-object p1, p0, LI7/x$c;->D:LI7/x;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/reflect/Member;
    .locals 1

    iget-object v0, p0, LI7/x$c;->D:LI7/x;

    invoke-virtual {v0}, LI7/y;->F()Ljava/lang/reflect/Member;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/x$c;->a()Ljava/lang/reflect/Member;

    move-result-object v0

    return-object v0
.end method
