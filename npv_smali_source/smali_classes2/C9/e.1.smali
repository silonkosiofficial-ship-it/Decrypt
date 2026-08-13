.class public final synthetic LC9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic C:LC9/g;


# direct methods
.method public synthetic constructor <init>(LC9/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC9/e;->C:LC9/g;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LC9/e;->C:LC9/g;

    invoke-static {v0}, LC9/g;->a(LC9/g;)Landroidx/lifecycle/t;

    move-result-object v0

    return-object v0
.end method
