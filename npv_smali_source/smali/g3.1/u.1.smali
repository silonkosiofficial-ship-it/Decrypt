.class public final synthetic Lg3/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg3/M$b;


# instance fields
.field public final synthetic a:Lg3/M;


# direct methods
.method public synthetic constructor <init>(Lg3/M;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg3/u;->a:Lg3/M;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lg3/u;->a:Lg3/M;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, p1}, Lg3/M;->y(Lg3/M;Landroid/database/Cursor;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
