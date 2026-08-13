.class public final synthetic LT6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:Ljava/lang/StringBuilder;

.field public final synthetic D:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/StringBuilder;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT6/b;->C:Ljava/lang/StringBuilder;

    iput-boolean p2, p0, LT6/b;->D:Z

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LT6/b;->C:Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LT6/b;->D:Z

    check-cast p1, Ljava/lang/Byte;

    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    move-result p1

    invoke-static {v0, v1, p1}, LT6/f;->c(Ljava/lang/StringBuilder;ZB)Li7/M;

    move-result-object p1

    return-object p1
.end method
