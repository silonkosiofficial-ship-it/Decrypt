.class public final synthetic LC9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic C:LC9/d$a;

.field public final synthetic D:Z

.field public final synthetic E:LF9/a;


# direct methods
.method public synthetic constructor <init>(LC9/d$a;ZLF9/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC9/a;->C:LC9/d$a;

    iput-boolean p2, p0, LC9/a;->D:Z

    iput-object p3, p0, LC9/a;->E:LF9/a;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LC9/a;->C:LC9/d$a;

    iget-boolean v1, p0, LC9/a;->D:Z

    iget-object v2, p0, LC9/a;->E:LF9/a;

    invoke-static {v0, v1, v2}, LC9/d;->c(LC9/d$a;ZLF9/a;)Li7/M;

    move-result-object v0

    return-object v0
.end method
