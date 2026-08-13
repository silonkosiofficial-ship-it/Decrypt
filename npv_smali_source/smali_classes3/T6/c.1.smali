.class public final synthetic LT6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:Z

.field public final synthetic D:Ljava/lang/StringBuilder;

.field public final synthetic E:Z


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/StringBuilder;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LT6/c;->C:Z

    iput-object p2, p0, LT6/c;->D:Ljava/lang/StringBuilder;

    iput-boolean p3, p0, LT6/c;->E:Z

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, LT6/c;->C:Z

    iget-object v1, p0, LT6/c;->D:Ljava/lang/StringBuilder;

    iget-boolean v2, p0, LT6/c;->E:Z

    check-cast p1, Ljava/lang/Byte;

    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    move-result p1

    invoke-static {v0, v1, v2, p1}, LT6/f;->b(ZLjava/lang/StringBuilder;ZB)Li7/M;

    move-result-object p1

    return-object p1
.end method
