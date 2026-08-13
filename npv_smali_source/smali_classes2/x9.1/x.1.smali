.class public final synthetic Lx9/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic C:Lx9/y;

.field public final synthetic D:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lx9/y;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx9/x;->C:Lx9/y;

    iput-object p2, p0, Lx9/x;->D:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lx9/x;->C:Lx9/y;

    iget-object v1, p0, Lx9/x;->D:Ljava/lang/String;

    invoke-static {v0, v1}, Lx9/y;->f(Lx9/y;Ljava/lang/String;)Lv9/f;

    move-result-object v0

    return-object v0
.end method
