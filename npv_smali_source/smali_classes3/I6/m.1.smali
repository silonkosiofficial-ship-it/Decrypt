.class public final synthetic LI6/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic C:LK6/a;


# direct methods
.method public synthetic constructor <init>(LK6/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI6/m;->C:LK6/a;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LI6/m;->C:LK6/a;

    invoke-static {v0}, LI6/l$b;->H(LK6/a;)Lio/ktor/utils/io/d;

    move-result-object v0

    return-object v0
.end method
