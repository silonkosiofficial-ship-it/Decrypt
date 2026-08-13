.class public final synthetic Le/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Le/j$g;

.field public final synthetic D:I

.field public final synthetic E:Landroid/content/IntentSender$SendIntentException;


# direct methods
.method public synthetic constructor <init>(Le/j$g;ILandroid/content/IntentSender$SendIntentException;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/m;->C:Le/j$g;

    iput p2, p0, Le/m;->D:I

    iput-object p3, p0, Le/m;->E:Landroid/content/IntentSender$SendIntentException;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Le/m;->C:Le/j$g;

    iget v1, p0, Le/m;->D:I

    iget-object v2, p0, Le/m;->E:Landroid/content/IntentSender$SendIntentException;

    invoke-static {v0, v1, v2}, Le/j$g;->q(Le/j$g;ILandroid/content/IntentSender$SendIntentException;)V

    return-void
.end method
