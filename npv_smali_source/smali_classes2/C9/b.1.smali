.class public final synthetic LC9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:LF9/a;

.field public final synthetic D:LC9/d$a;


# direct methods
.method public synthetic constructor <init>(LF9/a;LC9/d$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC9/b;->C:LF9/a;

    iput-object p2, p0, LC9/b;->D:LC9/d$a;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LC9/b;->C:LF9/a;

    iget-object v1, p0, LC9/b;->D:LC9/d$a;

    check-cast p1, LV/N;

    invoke-static {v0, v1, p1}, LC9/d;->a(LF9/a;LC9/d$a;LV/N;)LV/M;

    move-result-object p1

    return-object p1
.end method
